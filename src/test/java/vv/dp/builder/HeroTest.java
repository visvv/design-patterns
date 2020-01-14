package vv.dp.builder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void buildWithName() {
        Hero hero = (new Hero.Builder("sam")).build();
        Assert.assertEquals("sam", hero.getName());
    }

    @Test
    public void buildWithProfession() {
        Hero hero = new Hero.Builder("sam").withProfession(Proffesion.ACCOUNTANT).build();
        Assert.assertEquals(Proffesion.ACCOUNTANT, hero.getProffesion());
    }

    @Test
    public void buildWithArmor() {
        Hero hero = new Hero.Builder("sam").withArmor(Armor.CLOTHES).withProfession(Proffesion.ACTOR).build();
        Assert.assertEquals(Armor.CLOTHES, hero.getArmor());
        Assert.assertEquals(Proffesion.ACTOR, hero.getProffesion());
    }

    @Test
    public void buildWithHair() {
        Hero hero = new Hero.Builder("sam").withHair(Hair.BLACK)
                .withProfession(Proffesion.ARTIST)
                .withArmor(Armor.CHAIN_MAIL)
                .build();
        Assert.assertEquals(Hair.BLACK, hero.getHair());
        Assert.assertEquals(Armor.CHAIN_MAIL, hero.getArmor());
        Assert.assertEquals(Proffesion.ARTIST, hero.getProffesion());

    }
}