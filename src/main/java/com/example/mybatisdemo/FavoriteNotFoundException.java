package com.example.mybatisdemo;

public class FavoriteNotFoundException extends RuntimeException{
        public FavoriteNotFoundException() {
            super();
        }
        public FavoriteNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
        public FavoriteNotFoundException(String message) {
            super(message);
        }
        public FavoriteNotFoundException(Throwable cause) {
            super(cause);
        }

}

