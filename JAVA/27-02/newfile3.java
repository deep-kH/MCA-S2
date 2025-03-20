//MultiLevel inheritence

class Grandparent{
    String Iam(){
        System.out.println("I am Asswin");
        return "Asswin";
    }
}

class parent extends Grandparent{
    String iam(){
        System.out.println("I am AAaaron");
        System.out.println(super.Iam());
        return "AAaaron";
    }
}
class child extends parent{
    String Iam(){
        System.out.println("I am Zooori");
        System.out.println(super.Iam());
        return null;
    }
}

class newfile3{
    public static void main(String [] args){
        child Chugri = new child();
        Chugri.Iam();
    }
}