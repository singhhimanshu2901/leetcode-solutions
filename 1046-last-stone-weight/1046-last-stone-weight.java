class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : stones){
            q.add(num);
        }
        while(!q.isEmpty()){
            int a = (int)q.poll();
            if(q.isEmpty())
                return a;
            int b = (int)q.poll();
            int c = Math.abs(a-b);
            q.add(c);
        }
        return 0;
    }
}