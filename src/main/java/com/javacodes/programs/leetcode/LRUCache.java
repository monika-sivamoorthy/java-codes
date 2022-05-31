package com.javacodes.programs.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * #146
 */
class DNode {
    int key;
    int value;
    DNode prev;
    DNode next;
}


class LRUCache {

    private int capacity;

    Map<Integer, DNode> cache;

    private DNode head;
    private DNode tail;

    private void intialize() {

        cache = new HashMap<>();

        head = new DNode();
        head.prev = null;
        tail = new DNode();
        tail.next = null;

        head.next = tail;
        tail.prev = head;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        intialize();
    }

    public int get(int key) {

        if (!cache.containsKey(key)){
            return -1;
        }

        DNode node = cache.get(key);
        removeNode(node);
        placeInTop(node);
        return node.value;
    }

    public void put(int key, int value) {

        if (cache.containsKey(key)){

            DNode node = cache.get(key);
            node.value = value;
            removeNode(node);
            placeInTop(node);

        } else {

            if (cache.size() == capacity) {
                DNode last = tail.prev;
                removeNode(last);
                cache.remove(last.key);
            }
            DNode newNode = new DNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            placeInTop(newNode);
        }
    }

    private void removeNode(DNode node){
        DNode prev = node.prev;
        DNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void placeInTop(DNode node){
        DNode top = head.next;
        top.prev = node;
        node.next = top;
        node.prev = head;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */