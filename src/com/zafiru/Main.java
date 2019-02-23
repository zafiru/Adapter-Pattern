package com.zafiru;

import com.zafiru.characters.Goblin;
import com.zafiru.characters.ICharacter;
import com.zafiru.characters.Knight;
import com.zafiru.weapons.ClubBehaviour;
import com.zafiru.weapons.DaggerBehaviour;
import com.zafiru.weapons.SwordBehaviour;

public class Main {

    public static void main(String[] args) {

        ICharacter ourKnight = new Knight();
        ourKnight.setName("Zafiru");
        ourKnight.setWeaponBehaviour(new DaggerBehaviour());

        System.out.println(ourKnight.getName() + ", travels across countries to live an adventures life...");

        ICharacter evilGoblin = new Goblin();
        evilGoblin.setWeaponBehaviour(new ClubBehaviour());

        System.out.println("Than suddenly a " + evilGoblin.getType() + " appears.");
        System.out.println("And attacks " + ourKnight.getType());

        evilGoblin.hit();

        System.out.println(ourKnight.getName() + " tries to fight back");

        ourKnight.hit();

        System.out.println("But he couldn't inflict much damage");
        System.out.println("then he saw a sword on the ground and grabs it");

        ourKnight.setWeaponBehaviour(new SwordBehaviour());

        System.out.println("And fearlessly attack " + evilGoblin.getType());

        ourKnight.hit();
    }
}
