import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class HigherOrderFunctions {
  public static void main(final String[] args) {
    IntegerRange _upTo = new IntegerRange(1, 3);
    final Function1<Integer, Integer> _function = new Function1<Integer, Integer>() {
      @Override
      public Integer apply(final Integer x) {
        return Integer.valueOf(((x).intValue() * (x).intValue()));
      }
    };
    Iterable<Integer> _map = IterableExtensions.<Integer, Integer>map(_upTo, _function);
    String _plus = ("map:\n" + _map);
    InputOutput.<String>println(_plus);
    IntegerRange _upTo_1 = new IntegerRange(1, 3);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer x, final Integer y) {
        return Integer.valueOf(((x).intValue() + (y).intValue()));
      }
    };
    Integer _reduce = IterableExtensions.<Integer>reduce(_upTo_1, _function_1);
    String _plus_1 = (("\n" + "\nreduce:\n") + _reduce);
    InputOutput.<String>println(_plus_1);
    IntegerRange _upTo_2 = new IntegerRange(1, 3);
    final Function1<Integer, Boolean> _function_2 = new Function1<Integer, Boolean>() {
      @Override
      public Boolean apply(final Integer x) {
        return Boolean.valueOf((((x).intValue() % 2) == 0));
      }
    };
    Iterable<Integer> _filter = IterableExtensions.<Integer>filter(_upTo_2, _function_2);
    String _plus_2 = (("\n" + "filter:\n") + _filter);
    InputOutput.<String>println(_plus_2);
    IntegerRange _upTo_3 = new IntegerRange(1, 3);
    final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer x, final Integer y) {
        return Integer.valueOf(((x).intValue() + (y).intValue()));
      }
    };
    Integer _reduce_1 = IterableExtensions.<Integer>reduce(_upTo_3, _function_3);
    int tmp = (1 + (_reduce_1).intValue());
    InputOutput.<String>println((("\n" + "tmp:\n") + Integer.valueOf(tmp)));
    LinkedList<String> values = new LinkedList<String>();
    values.add("one");
    values.add("two");
    final Function1<String, String> _function_4 = new Function1<String, String>() {
      @Override
      public String apply(final String text) {
        String _replace = text.replace("o", "O");
        return _replace.replace("t", "T");
      }
    };
    List<String> _map_1 = ListExtensions.<String, String>map(values, _function_4);
    String _plus_3 = (("\n" + "map strings:\n") + _map_1);
    InputOutput.<String>println(_plus_3);
    IntegerRange _upTo_4 = new IntegerRange(1, 3);
    final Function1<Integer, Boolean> _function_5 = new Function1<Integer, Boolean>() {
      @Override
      public Boolean apply(final Integer it) {
        return Boolean.valueOf((((it).intValue() % 2) == 0));
      }
    };
    boolean _exists = IterableExtensions.<Integer>exists(_upTo_4, _function_5);
    String _plus_4 = (("\n" + "exists:\n") + Boolean.valueOf(_exists));
    InputOutput.<String>println(_plus_4);
    IntegerRange _upTo_5 = new IntegerRange(1, 3);
    final Function1<Integer, Boolean> _function_6 = new Function1<Integer, Boolean>() {
      @Override
      public Boolean apply(final Integer it) {
        return Boolean.valueOf((((it).intValue() % 2) == 0));
      }
    };
    boolean _forall = IterableExtensions.<Integer>forall(_upTo_5, _function_6);
    String _plus_5 = (("\n" + "forall:\n") + Boolean.valueOf(_forall));
    InputOutput.<String>println(_plus_5);
    IntegerRange _upTo_6 = new IntegerRange(1, 10);
    final Function1<Integer, Integer> _function_7 = new Function1<Integer, Integer>() {
      @Override
      public Integer apply(final Integer it) {
        return Integer.valueOf(((it).intValue() + 1));
      }
    };
    Iterable<Integer> _map_2 = IterableExtensions.<Integer, Integer>map(_upTo_6, _function_7);
    final Function1<Integer, Boolean> _function_8 = new Function1<Integer, Boolean>() {
      @Override
      public Boolean apply(final Integer it) {
        return Boolean.valueOf((((it).intValue() != 11) && ((it).intValue() != 5)));
      }
    };
    Iterable<Integer> _filter_1 = IterableExtensions.<Integer>filter(_map_2, _function_8);
    String _plus_6 = (("\n" + "mixture:\n") + _filter_1);
    InputOutput.<String>println(_plus_6);
    InputOutput.<String>println("\nforEach:");
    IntegerRange _upTo_7 = new IntegerRange(1, 3);
    final Procedure1<Integer> _function_9 = new Procedure1<Integer>() {
      @Override
      public void apply(final Integer it) {
        String _plus = (it + "*2 = ");
        String _plus_1 = (_plus + Integer.valueOf(((it).intValue() * 2)));
        InputOutput.<String>println(_plus_1);
      }
    };
    IterableExtensions.<Integer>forEach(_upTo_7, _function_9);
  }
}
