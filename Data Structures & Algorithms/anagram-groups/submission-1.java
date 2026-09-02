class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // [e,a,t] => [a,e,t] => "aet" *key List<>
        //"a" = 97  
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] code = new int[26];
            for(char current : s.toCharArray()){
                code[current - 'a']++;
            }
            String key = Arrays.toString(code);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());

    }
}