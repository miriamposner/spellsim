package edu.hogwarts.SpellSim.Spells;

class Alohomora implements Spell {
    public String name = "Alohomora";
    
    public String getName () {
    	return name;
    }

    public void invokeOn(Subject subject) {
        throw new NotImplementedError("Not yet implemented.");
    }
}

    