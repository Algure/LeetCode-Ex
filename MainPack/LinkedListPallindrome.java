/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
       ListNode fast=head;
        ListNode slow=head;
        ListNode temp=null;
        ListNode tempNode=null;
        ListNode revNode=null;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            System.out.print(String.format(" %d",slow.val));
        }
        
        slow=reverseList(slow);
        fast=head;
        
        //DISPLAY/DEBUG BLOCK
        ListNode tslow=slow;
        ListNode tfast=fast;
        System.out.print("\n slow: ");
        while(tslow!=null){
            System.out.print(String.format(" %d",tslow.val));
            tslow=tslow.next;
        }
        System.out.print("\n fast: ");
          while(tfast!=null){
            System.out.print(String.format(" %d",tfast.val));
            tfast=tfast.next;
        }
        System.out.println("");
        //////////////////////////////
        
        while(fast!=null){
            if(fast.val!=slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
            if(slow==null || fast==null){
                break;
            }
        }
        return true;
    }
    
    public ListNode reverseList(ListNode node){
        ListNode rev=null;
        System.out.print("\n slow: ");
        ListNode prev=null;
        while(node!=null){
            if(rev!=null)
                prev=new ListNode(rev.val,rev.next);
            if(rev==null){
                rev=new ListNode();
            }
            rev.val=node.val;
            rev.next=prev;
            node=node.next;
        }
        
        return rev;
    }
}
