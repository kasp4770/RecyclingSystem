public enum Types {A("A"), B("B"), C("C");

private String type;

Types(String type){
    this.type = type;
}

public String getType(){
    return this.type;
}
}
