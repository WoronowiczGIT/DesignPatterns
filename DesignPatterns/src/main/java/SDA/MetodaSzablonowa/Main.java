package SDA.MetodaSzablonowa;

import SDA.MetodaSzablonowa.ComputerMaker.ComputerTemplate;
import SDA.MetodaSzablonowa.ComputerMaker.HighEndDesktop;
import SDA.MetodaSzablonowa.ComputerMaker.LowEndDesktop;
import SDA.MetodaSzablonowa.ComputerMakerV2.Computer;
import SDA.MetodaSzablonowa.ComputerMakerV2.ComputerMaker;
import SDA.MetodaSzablonowa.ComputerMakerV2.ExpensiveComputer;

public class Main {
    public static void main(String[] args) {

        ComputerTemplate myComputer = new HighEndDesktop();
        ComputerTemplate myMomComputer = new LowEndDesktop();
       // myComputer.assembleDesktop();
       // myMomComputer.assembleDesktop();

        ComputerMaker maker = new ExpensiveComputer();
        System.out.println(maker.assambleTemplate());



    }
}
