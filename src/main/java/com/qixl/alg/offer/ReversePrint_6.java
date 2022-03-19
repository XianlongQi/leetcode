package com.qixl.alg.offer;

import java.util.Iterator;
import java.util.Stack;

import com.qixl.alg.model.ListNode;

/**
 * 剑指 Offer 06. 从尾到头打印链表 .
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class ReversePrint_6 {

  public int[] reversePrint(ListNode head) {
    if(null == head){
      return new int[0];
    }
    Stack stack = new Stack();
    ListNode current = head;
    while (current != null){
      stack.push(current.val);
      current = current.next;
    }
    int len = stack.size();
    int[] result = new int[len];

    for(int i = 0;i<len;i++){
      result[i] = (int)stack.pop();
    }
    return result;
  }

}
