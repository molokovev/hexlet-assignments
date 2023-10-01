package exercise;

import java.util.List;
import java.util.Map;

// BEGIN
class PairedTag extends Tag {
    private final String body;
    private final List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String body, List<Tag> children) {
        super(name, attributes);
        this.body = body;
        this.children = children;
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

        if (!body.equals("")) {
            builder.append(body);
        } else {
            children.stream().forEach(tag -> builder.append(tag.toString()));
        }

        builder.append("</").append(name).append(">");

        return builder.toString();
    }
}
// END
