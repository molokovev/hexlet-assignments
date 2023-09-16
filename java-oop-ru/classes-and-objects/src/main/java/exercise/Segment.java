package exercise;

// BEGIN
class Segment {
    Point begin;
    Point end;

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    Point getBeginPoint() {
        return begin;
    }

    Point getEndPoint() {
        return end;
    }

    Point getMidPoint() {
        return new Point((begin.getX() + end.getX()) / 2, (begin.getY() + end.getY()) / 2);
    }
}
// END
