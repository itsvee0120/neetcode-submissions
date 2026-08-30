class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            //sort
            char[] chars = str.toCharArray(); // convert to char first to sort each char
            Arrays.sort(chars); // sort func
            String key = new String(chars); //after sort convert back to new string name key
            
            //check map
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
    return new ArrayList<>(map.values());
        
    }
}
