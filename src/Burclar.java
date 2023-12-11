import java.util.Scanner;
public class Burclar {
    public static void main(String[] args) {
        boolean restart = false;

        do {
            calculateHoroscope();
            Scanner i = new Scanner(System.in);
            System.out.print("Do you want to restart the program? (y/n) : ");
            String answer = i.nextLine();
            if (answer.equals("y")) {
                restart = true;
            } else {
                restart = false;
            }
        } while (restart);
    }

    public static void calculateHoroscope() {
        int month, day;
        String horoscope = "";
        boolean isError = false;
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your birth month : ");
        month = i.nextInt();
        System.out.print("Enter your birth day : ");
        day = i.nextInt();
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Aries";
                    } else {
                        horoscope = "Taurus";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
                break;
        }
        if (isError) {
            System.out.println("Invalid date!");
        } else {
            System.out.println("Your horoscope : " + horoscope);
        }
    }
}
