package solidus;

public class shoppingSolidus {

    private static int userStartBalance;
    private static String userTypeOfAccess;
    static boolean goldMemberUser;

    public shoppingSolidus(int userBalance, String typeOfUser) {
        userStartBalance = userBalance;
        userTypeOfAccess = typeOfUser;
        goldMemberUser = false;
    }

    public static int getStartBalance() {
        return userStartBalance;
    }

    public static String getUserType() {
        return userTypeOfAccess;
    }

    public static void setUserType(String newType) {
        userTypeOfAccess = newType;
    }

    public static int userLogInBalance() {
        if (goldMemberUser) {
            userStartBalance += 20;
        }
        return userStartBalance + 1;
    }

    public static int becomeGoldMember() {
        goldMemberUser = true;
        userStartBalance = userStartBalance + 20;
        return userStartBalance;
    }

    public static boolean hoodie() {
        if (userStartBalance >= 20) {
            userStartBalance = userStartBalance - 20;
            System.out.println("You can buy a hoodie" + " and you have " + userStartBalance + " solidus left");
            return true;
        }
        System.out.println("You don't have enough money");
        return false;
    }

    public static double[] merch() {
        userStartBalance=119;
        double hoodie = 20;
        double tshirt = 15;
        double stickers = 3; //Changed the price to see if algorithm for stickers works, otherwise 15+5 is always 20
        int hoodieAmount = 0;
        int tshirtAmount = 0;
        int stickersAmount = 0;
        while (userStartBalance >= hoodie || userStartBalance >= tshirt || userStartBalance >= stickers) {
                if (userStartBalance >= hoodie) {
                    userStartBalance -= (int) hoodie;
                    hoodieAmount++;
                } else if (userStartBalance >= tshirt) {
                    userStartBalance -= (int) tshirt;
                    tshirtAmount++;
                } else if (userStartBalance >= stickers) {
                    userStartBalance -= (int) stickers;
                    stickersAmount++;
                }
            }
        return new double[]{hoodieAmount, tshirtAmount, stickersAmount, userStartBalance};
    }
}


