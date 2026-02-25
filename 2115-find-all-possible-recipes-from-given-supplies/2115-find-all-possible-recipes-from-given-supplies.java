class Solution {
    private Map<String , List<String>> recipesToIngredients;
    private Set<String> availableSupplies; 
    private Map<String , Integer> visited;
    List<String> result;
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        
        recipesToIngredients = new HashMap<>();
        availableSupplies = new HashSet<>(Arrays.asList(supplies));
        result = new ArrayList<>();
        visited = new HashMap<>();
        for(int i = 0;i<recipes.length ; i++){
           recipesToIngredients.put(recipes[i],ingredients.get(i));
        }
        for(String recipe : recipes){
            canMake(recipe);
        }
        return result;
    }
    public boolean canMake(String recipe){
        if(visited.containsKey(recipe)){
            return visited.get(recipe)==1;
        }
        if(availableSupplies.contains(recipe)){
            return true;
        }
        if(!recipesToIngredients.containsKey(recipe)){
            return false;
        }
        visited.put(recipe,0);
        for(String ingredient: recipesToIngredients.get(recipe)){
            if(!canMake(ingredient)){
                visited.put(recipe,-1);
                return false;
            }
        }
        result.add(recipe);
        visited.put(recipe,1);
        return true;
    }
}