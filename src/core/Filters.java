package core;

import condition.comparison.*;
import condition.logical.*;
import condition.literals.*;

public final class Filters {
  public static Operator eq(String p, String v)       { return new Equals(p, v); }
  public static Operator gt(String p, Number n)       { return new Greater(p, n.toString()); }
  public static Operator lt(String p, Number n)       { return new Less(p, n.toString()); }
  public static Operator present(String p)            { return new Exist(p); }
  public static Operator regex(String p, String r)    { return new RegularExpression(p, r); }

  public static Operator T() { return new True(); }
  public static Operator F() { return new False(); }

  public static Filter and(Filter... fs) { return new And(fs); }
  public static Filter or (Filter... fs) { return new Or(fs); }
  public static Filter not(Filter f)     { return new Not(f); }

  private Filters() {}
}