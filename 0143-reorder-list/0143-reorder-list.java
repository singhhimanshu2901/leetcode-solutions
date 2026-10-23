class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode curr = head;
        int c = 0;
        while(curr != null) {
            c++;
            curr = curr.next;
        }
        int n = (c + 1) / 2;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        curr = head;
        for(int i = 0; i < n; i++) {
            l1.add(curr.val);
            curr = curr.next;
        }
        while(curr != null) {
            l2.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(l2);
        List<Integer> l = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < l1.size() || j < l2.size()) {
            if(i < l1.size()) {
                l.add(l1.get(i));
                i++;
            }
            if(j < l2.size()) {
                l.add(l2.get(j));
                j++;
            }
        }
        curr = head;
        int k = 0;
        while(curr != null) {
            curr.val = l.get(k);
            curr = curr.next;
            k++;
        }
    }
}