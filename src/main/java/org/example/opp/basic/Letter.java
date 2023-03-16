package org.example.opp.basic;

import java.util.ArrayList;

public class Letter {
    String from;
    String to;
    ArrayList <String> lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
    }
    public void addLine(String line){
        this.lines.add(line);
    }

    public String toText(){
        StringBuilder ris = new StringBuilder();
        ris.append("Dear ");
        ris.append(this.to + "\n");
        for(String str : this.lines){
            ris.append(str + "\n");
        }
        ris.append("\nSincerely,\n\n" + this.from);
        return ris.toString();
    }
}
