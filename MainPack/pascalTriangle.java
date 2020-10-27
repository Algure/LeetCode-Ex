class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList=new LinkedList();
        List<Integer> tempList=new LinkedList();
        List<Integer> q=new LinkedList();
        
        if(numRows==0) return ansList;
        
        tempList.add(1);
        ansList.add(tempList);
        if(numRows==1) return ansList;
        
        q.addAll(tempList);
        for(int i=1; i<numRows; i++){
            tempList=new LinkedList();
            int size= q.size()-1;
            tempList.add(1);
            for(int j=0; j<size; j++){
                tempList.add(q.get(j)+q.get(j+1));
            }
            tempList.add(1);
            q=tempList;
            ansList.add(tempList);
        }
        return ansList;
    }
}
