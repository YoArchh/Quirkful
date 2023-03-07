package me.yoarchh.quirkful.quirks;

public class QuirkAttributes
{
    private final String quirkName;
    private final String quirkDescription;
    private final QuirkCategory quirkCategory;

    protected QuirkAttributes(String quirkName, String quirkDescription, QuirkCategory quirkCategory)
    {
        this.quirkName = quirkName;
        this.quirkDescription = quirkDescription;
        this.quirkCategory = quirkCategory;
    }

    public static QuirkAttributes.Builder builder()
    {
        return new Builder();
    }

    public String getName()
    {
        return this.quirkName;
    }

    public String getDescription()
    {
        return this.quirkDescription;
    }

    public QuirkCategory getCategory()
    {
        return this.quirkCategory;
    }

    @Override
    public String toString()
    {
        StringBuilder quirkAttributesStr = new StringBuilder();
        quirkAttributesStr.append("Name: ").append(this.quirkName).append("\n");
        quirkAttributesStr.append("Description: ").append(this.quirkDescription).append("\n");
        quirkAttributesStr.append("Category: ").append(this.quirkCategory);

        return quirkAttributesStr.toString();
    }

    public static final class Builder
    {
        private String quirkName;
        private String quirkDescription;
        private QuirkCategory quirkCategory;

        private Builder() {}

        public Builder name(String name)
        {
            this.quirkName = name;

            return this;
        }

        public Builder description(String description)
        {
            this.quirkDescription = description;

            return this;
        }

        public Builder category(QuirkCategory category)
        {
            this.quirkCategory = category;

            return this;
        }

        public QuirkAttributes build()
        {
            return new QuirkAttributes(this.quirkName, this.quirkDescription, this.quirkCategory);
        }
    }
}
