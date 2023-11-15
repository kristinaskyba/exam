package solidus;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static wshop6.solidus.shoppingSolidus.merch;


//18. Det finns en intern valuta ”solidus” som man
//kan göra uttag ifrån. Man kan såklart enbart
//göra så stort uttag som man har ”råd med”. Alla
//börjar med 5 solidus och när man blir gold
//member får man 20 solidus automatiskt.
//Användarna vill såklart kunna ta reda på hur
//många solidus de har. Varje gång man loggar in
//får man en solidus. Med solidus kan man köpa
//merch: hoodie kostar 20 solidus, t-shirt 15
//solidus och stickers 5 solidus. Detta är en massa
//funktioner, utveckla dem därför med flera steg
//enligt TDD
public class shoppingMoney { //Testing here the balance from the beginning
    @Test
    public void solidusBeginBalance() {
        new shoppingSolidus(5, "gold");
        int expected = 6;
        int actual = shoppingSolidus.getStartBalance();
        assertEquals(expected, actual);
    }

    @Test
    public void getUserType() { // Testing user type
        new shoppingSolidus(5, "regular");
        String expected = "regular";
        String actual = shoppingSolidus.getUserType();
        assertEquals(expected, actual);
    }

    @Test
    public void settUserType() { //Changing user type
        new shoppingSolidus(20, "regular");
        String expected = "golden";
        shoppingSolidus.setUserType("golden");
        String actual = shoppingSolidus.getUserType();
        assertEquals(expected, actual);
    }

    @Test
    public void loginBalance() { //Testing log in and 1 point with every log in
        new shoppingSolidus(10, "golden");
        int expected = 29;
        int actual = shoppingSolidus.userLogInBalance();
        assertEquals(expected, actual);
    }

    @Test
    public void loginBalanceGolden() { //if user log in already with gold account
        new shoppingSolidus(15, "golden");
        int expected = 26;
        int actual = shoppingSolidus.becomeGoldMember();
        assertEquals(expected, actual);
    }

    //Med solidus kan man köpa merch: hoodie kostar 20 solidus, t-shirt 15 solidus och stickers 5 solidus.

    //This task is not clear. What shall we test here? How many different items
    // user can buy for his money and what is left after?
    @Test
    public void buyingHoodie() { //Testing if user has enough money to buy most expensive item
        new shoppingSolidus(15, "normal");
        boolean expected = true;
        boolean actual = shoppingSolidus.hoodie();
        assertEquals(expected, actual);
    }

    @Test
    public void buyingMerchHoodie() { //How many hoodie he can buy for his money
        new shoppingSolidus(39, "normal");
        double[] result = merch();
        assertEquals(3, result[0], 1);

    }

    @Test
    public void buyingMerchTshirt() { //How many t-shirts user can buy after he bought hoodie
        new shoppingSolidus(39, "normal");
        double[] result = merch();
        assertEquals(10, result[1], 1);
    }

    @Test
    public void buyingMerchSticker() { //How many stickers user can buy after hoodie and t-shirts
        new shoppingSolidus(138, "normal");
        double[] result = merch();
        assertEquals(10, result[2], 1);
    }

    @Test
    public void buyingMerch() { //How much money is left after purchases
        new shoppingSolidus(142, "normal");
        double[] result = merch();
        assertEquals(5, result[3], 1);
    }
}


