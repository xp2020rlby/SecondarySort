package SecondarySort;

import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class SecondSortReducer extends Reducer<Pair_Int, NullWritable, Pair_Int, NullWritable> {

	@Override
	public void reduce(Pair_Int key, Iterable<NullWritable> values, Context context)
			throws IOException, InterruptedException {
		for (NullWritable ignored : values) {//int对在key中，value为空，直接忽略
			context.write(key, NullWritable.get());
		}
	}
}