package org.example.opp.basic;

import java.util.ArrayList;

public class Letter {
    String from;
    String to;
    ArrayList <String> lines;

    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new ArrayList<>();
    }
    public void addLine(String line){
        lines.add(line);
    }

    public String toText(){
        StringBuilder ris = new StringBuilder();
        ris.append("Dear ").append(this.to).append("\n\n");
        for(String str : lines){
            ris.append(str).append("\n");
        }
        ris.append("\nSincerely,\n\n").append(this.from);
        return ris.toString();
    }
}
