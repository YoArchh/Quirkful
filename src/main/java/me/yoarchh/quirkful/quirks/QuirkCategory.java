package me.yoarchh.quirkful.quirks;

public enum QuirkCategory
{
    EMITTER("Emitter"),
    TRANSFORMATION("Transformation"),
    MUTANT("Mutant"),
    UNKNOWN("Unknown");

    private final String ID;

    QuirkCategory(String id)
    {
        this.ID = id;
    }

    @Override
    public String toString()
    {
        return getID();
    }

    public String getID()
    {
        return ID;
    }
}
