package net.emmecilab.memento;

/**
 *
 * @author Mauro Cicolella
 */
public class Client {

    public static void main(String args[]) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        //Set initial originator state
        originator.setState("State 1");
        //Save state to careTaker
        careTaker.add(originator.saveStateToMemento());

        //Change current state
        originator.setState("State 2");
        //Save to careTaker 
        careTaker.add(originator.saveStateToMemento());
        
        //Change current state
        originator.setState("State 3");
        //Save to careTaker 
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State is: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Initial state : " + originator.getState());
        
        

    }
}
