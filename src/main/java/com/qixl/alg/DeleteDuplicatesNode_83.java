package com.qixl.alg;

import com.qixl.alg.model.ListNode;

/**
 * 删除排序链表中的重复元素 .
 * Given the head of a sorted linked list, delete all duplicates such that each element appears
 * only once. Return the linked list sorted as well.
 */
public class DeleteDuplicatesNode_83 {

  public static void main(String[] args) {
    DeleteDuplicatesNode_83 s = new DeleteDuplicatesNode_83();
    ListNode head3 = new ListNode(2, null);
    ListNode head2 = new ListNode(1, head3);
    ListNode head1 = new ListNode(1, head2);

    s.deleteDuplicates(head1);
  }

  /**
   * 快慢指针法 .
   *
   * @param head listnode
   * @return new unduplicate listnode .
   */
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null) {
      if (fast.val != slow.val) {
        //当前元素赋值给慢指针的下一个节点
        slow.next = fast;
        //慢指针迁移一位
        slow = slow.next;
      }
      //快指针继续往前移动
      fast = fast.next;
    }
    //最后一个元素的next置为空
    slow.next = null;
    return head;
  }
}
