package cn.fenqing168.lintcode;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fenqing
 */
public class Theme466 {

    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public static int countNodes(ListNode head) {
        // write your code here
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode listNode = CommonUtils.string2Linked(ListNode.class, ListNode::setVal, Integer::parseInt, ListNode::setNext, "[1,3,5]");
        int i = countNodes(listNode);
        System.out.println(i);
    }

}

@Data
@NoArgsConstructor
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}
