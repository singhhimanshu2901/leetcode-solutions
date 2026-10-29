class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0) + 1);
        }
        PriorityQueue<Object[]> pq = new PriorityQueue<>(
            (a, b) -> (int) b[1] - (int) a[1]);
        for(int num : map.keySet()){
            pq.add(new Object[]{num, map.get(num)});
        }
        int i=0;
        while (i<k){
            Object[] current = pq.poll();
            int ch = (int) current[0];
            arr[i] = ch;
            i+=1;
        }
        return arr;
    }
}