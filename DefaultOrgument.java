class DefaultOrgument{
    int Eight(); //method declation
    int Eight(){ //method initaltion (method with body)
        return (8);
    }
    public static void main(String[] args) {
        DefaultOrgument test1 = new DefaultOrgument();
        System.out.println(test1.Eight());
    }
}