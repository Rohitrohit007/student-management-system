class room
{
    float length;
    float breadth;
    room (float x, float y)
{
    length= x;
    breadth=y;
}
room (float x)
{
    length=breadth=x;
}
int area ()
{
    return (length*breadth);

}

}