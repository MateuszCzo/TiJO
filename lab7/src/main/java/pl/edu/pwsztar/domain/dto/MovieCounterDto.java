package pl.edu.pwsztar.domain.dto;

public class MovieCounterDto {

    private long counter;

    private MovieCounterDto(Builder builder) {
        this.counter = builder.counter;
    }

    public long getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "MovieCounterDto{" +
                "counter=" + counter +
                '}';
    }

    public final static class Builder {
        private long counter;

        public Builder() {
        }

        public Builder counter(long counter) {
            this.counter = counter;
            return this;
        }

        public Builder fromPrototype(MovieCounterDto prototype) {
            this.counter = prototype.counter;
            return this;
        }

        public MovieCounterDto build() {
            return new MovieCounterDto(this);
        }
    }
}
