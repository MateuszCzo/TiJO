package pl.edu.pwsztar.domain.mapper;

@FunctionalInterface
public interface Converter<T, F> {
    public T convert(F from);
}

/*
class User { }
class UserDto { }

@FunctionalInterface
interface Converter<T, F> {
    T convert(F from);
}

class UserMapper implements Converter<User, UserDto> {

    @Override
    public User convert(UserDto from) {
        return new User();
    }
}

class UserDtoMapper implements Converter<UserDto, User> {

    @Override
    public UserDto convert(User from) {
        return new UserDto();
    }
}

public class Main {

    public static void main(String[] args) {
        final User user = new User();
        final UserDto userDto = new UserDto();

        // DTO -> ENTITY
        Converter<User, UserDto> userMapper = new UserMapper();
        User convertUser = userMapper.convert(userDto);

        // ENTITY -> DTO
        Converter<UserDto, User> userDtoMapper = new UserDtoMapper();
        UserDto convertUserDto = userDtoMapper.convert(user);
    }
}*/