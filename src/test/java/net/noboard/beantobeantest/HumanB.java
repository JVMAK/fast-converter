package net.noboard.beantobeantest;

import lombok.Data;

import java.util.List;

@Data
public class HumanB {
    private Woman human;

    private List<ChildB> children;
}
