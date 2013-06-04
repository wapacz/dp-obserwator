package Observers;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;

import Observers.Obserwowany;
import Observers.Obserwator;
import Observers.ObserwatorSilnika;

public class Silnik implements Obserwowany
{
    protected List<Obserwator> obserwatorzy;
    private String stanObserwowanego;

    public Silnik()
    {
		obserwatorzy = new ArrayList<Obserwator>();
		
		this.stanObserwowanego = "NOWY";
    }

    public void Wlacz()
    {
		this.stanObserwowanego = "Wlaczony";
		this.powiadomObserwatorow();
    }
    
    public void Wylacz()
    {
		this.stanObserwowanego = "Wylaczony";
		this.powiadomObserwatorow();
    }

    public void dodajObserwatora(Obserwator obserwator)
    {
		obserwatorzy.add(obserwator);
    }

    public void powiadomObserwatorow() 
    {    
		Iterator it = this.obserwatorzy.iterator();
		while(it.hasNext())
		{
		    ((Obserwator)it.next()).uaktualnij(this);
		}
    }
																			
    public void usunObserwatora(Obserwator obserwator)
    {
		this.obserwatorzy.remove(obserwator);
    }

    public String pobierzStan() 
    {
		return this.stanObserwowanego;
    }

}