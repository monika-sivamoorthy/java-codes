package com.javacodes.programs.leetcode;

import java.util.*;

/**
 * #200
 */
public class NumberOfIslands {


    char[][] grid;

    // check all sides for land
    public List<int[]> getChilds(int[] coordinates, int rows, int columns){


        List<int[]> childs = new LinkedList<>();
        int r = coordinates[0];
        int c = coordinates[1];

        // check top
        if (((r-1) > -1) && (grid[r-1][c] == '1') ) {
            grid[r-1][c] = '0';
            childs.add(new int[]{r-1,c});
        }

        // check bottom
        if (((r+1) < rows) && (grid[r+1][c] == '1')) {
            grid[r+1][c] = '0';
            childs.add(new int[]{r+1,c});
        }

        //check left
        if (((c-1) > -1) && (grid[r][c-1] == '1')) {
            grid[r][c-1] = '0';
            childs.add(new int[]{r,c-1});
        }

        // check right
        if (((c+1) < columns) && (grid[r][c+1] == '1')) {
            grid[r][c+1] = '0';
            childs.add(new int[]{r,c+1});
        }


        return childs;

    }

    public int numIslands(char[][] grid) {

        this.grid = grid;

        int rows = grid.length;
        int columns = grid[0].length;
        int islands = 0;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){

                if (grid[r][c] == '1') {

                    islands+=1;

                    List<int[]> q = new LinkedList<>();

                    q.add(new int[]{r,c});

                    while(q.size() > 0){
                        int[] coordinates = q.remove(0);
                        q.addAll(getChilds(coordinates, rows, columns));
                    }
                }
            }
        }

        return islands;

    }

}
