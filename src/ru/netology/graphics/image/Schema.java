package ru.netology.graphics.image;

public class Schema implements TextColorSchema {

    public Schema() {
    }

    @Override
    public char convert(int color) {
        char[] symbols = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
        char c = symbols [color/32];
        return c;
    }
}
