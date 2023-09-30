package exercise;

// BEGIN
class InputTag implements TagInterface {
    private final String type;
    private final String value;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String render() {
        return String.format("<input type=\"%s\" value=\"%s\">", this.type, this.value);
    }
}
// END
