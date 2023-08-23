package pacman;

public class SupportMap {

    public static BSqr[][] _setupMap2 = {
     {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.ENERGIZER,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.ENERGIZER,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.GHOST_START,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.GHOST_START,BSqr.WALL,BSqr.GHOST_START,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.PACMAN_START,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.GHOST_START,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.ENERGIZER,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.ENERGIZER,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
     {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL}
    };

    public static BSqr[][] _setupMap = {
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.ENERGIZER,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.ENERGIZER,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.GHOST_START,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.GHOST_START,BSqr.GHOST_START,BSqr.GHOST_START,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.DOT,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.DOT,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.FREE,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.ENERGIZER,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.PACMAN_START,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.ENERGIZER,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.DOT,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.DOT,BSqr.WALL},
        {BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL,BSqr.WALL}
    };

    public static BSqr[][] getSupportMap(){
        return _setupMap2;
    }
    
}
