package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String name, Map<String, String> attributes) {
        super(name, attributes);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append("<")
                .append(name);

        attributes.entrySet().stream().forEach(stringStringEntry -> builder
                .append(" ")
                .append(stringStringEntry.getKey())
                .append("=\"")
                .append(stringStringEntry.getValue())
                .append("\""));

        builder.append(">");

        return builder.toString();
    }
}
// END
