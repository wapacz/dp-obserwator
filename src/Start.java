package Observers;

import Observers.Silnik;
import Observers.ObserwatorSilnika;


public class Start
{
    public static void main(String[] args)
    {
		Silnik silnik = new Silnik();
		silnik.dodajObserwatora(new ObserwatorSilnika());
		silnik.Wlacz();
		silnik.Wylacz();
    }
}