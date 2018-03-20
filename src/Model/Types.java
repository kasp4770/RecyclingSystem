package Model;

public enum Types {A('A'), B('B'), C('C');

private char type;

Types(char type){
    this.type = type;
}

public char getType(){
    return this.type;
}
}
