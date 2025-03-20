class Area{
    int radius;
    Area(int x){
        radius = x;
    }
    void calcarea(){
        double ar = 3.14*radius*radius;
        System.out.println("Area is : "+ar);
    }
    public static void main(String arg[]){
        Area ob = new Area(21);
        ob.calcarea();
    }
}