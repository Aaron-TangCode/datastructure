package com.hailintang.array;

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2019/12/9 18:55
 * @Created Hailin.Tang
 */
public class Array {
    private int[] array;
    private int size;

    public Array(int capacity){
        array = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    /**
     * 在数组末尾添加
     */
    public void addLast(int e){
        add(size,e);
    }
    /**
     * 在数组头部添加
     */
    public void addFirst(int e){
        add(0,e);
    }

    /**
     * 在任意位置添加
     */
    public void add(int index,int e){
        if(index<0||index>size){
            throw new IllegalArgumentException("required index>=0&&index<size");
        }
        if(index>=array.length){
            resize(array,array.length*2);
        }
        for(int i=size-1;i>=index;i--){
            array[i] = array[i-1];
        }
        array[index] = e;
        size++;
    }

    private void resize(int[] array,int len) {
        int[] temp = Arrays.copyOf(array, len);
        this.array = temp;
    }

    /**
     * 删除任意位置
     */
    public void remove(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("required index>=0&&index<size");
        }
        for(int i=index;i<size;i++){
            array[i] = array[i+1];
        }
        size--;
        if(size!=0&&size<(array.length/2)){
            resize(array,array.length/2);
        }
    }

    /**
     * 删除开头
     */
    public void removeFirst(){
        remove(0);
    }

    /**
     * 删除末尾
     */
    public void removeLast(){
        remove(size-1);
    }
    /**
     * 修改
     */
    public void update(int index,int e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("required index>=0&&index<size");
        }
        array[index] = e;
    }

    /**
     * 查询
     */
    public int find(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("required index>=0||index<size");
        }
        return array[index];
    }

    /**
     * 数组长度
     * @return
     */
    public int getLength(){
        return array.length;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("size=%d,capacity=%d\n",size,array.length));
        sb.append("[");
        for(int i=0;i<size;i++){
            sb.append(array[i]);
            if(i!=size-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        Array array = new Array(4);
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(3);
        array.addLast(3);
        System.out.println(array);
        array.removeLast();
        array.removeLast();
        System.out.println(array);

    }
}
