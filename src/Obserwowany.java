package Observers;

import Observers.Obserwator;

public interface Obserwowany
{
    public void dodajObserwatora(Obserwator obserwator);
    public void usunObserwatora(Obserwator obserwator);
    public void powiadomObserwatorow();
    public String pobierzStan();
}