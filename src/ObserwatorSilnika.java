package Observers;

import Observers.Obserwator;

public class ObserwatorSilnika implements Obserwator
{
    public void uaktualnij(Obserwowany obserwowany)
    {
	System.out.println("+----------------------------------------------------------+");
	System.out.println("  --== ZDARZENIE ==--");
	System.out.println("  Obiekt: "+obserwowany);
	System.out.println("  Zmienil stan na: "+obserwowany.pobierzStan());
	System.out.println("+----------------------------------------------------------+");
    }
}