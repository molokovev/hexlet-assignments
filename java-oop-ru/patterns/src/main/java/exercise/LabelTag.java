package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private final String value;
    private final TagInterface childTag;

    public LabelTag(String value, TagInterface childTag) {
        this.value = value;
        this.childTag = childTag;
    }

    @Override
    public String render() {
        return String.format("<label>%s%s</label>", this.value, this.childTag.render());
    }
}
// END
