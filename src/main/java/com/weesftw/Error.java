package com.weesftw;

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@lombok.Data
@lombok.experimental.SuperBuilder(toBuilder = true)
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Schema(description = "Error schema")
public class Error
{
    @Schema(name = "message", required = true, type = "string", format = "byte")
    @JsonProperty("message")
    @lombok.Builder.Default
    @NotNull
    private byte[] message = null;

    public Error mensagem(byte[] mensagem) {
        this.message = mensagem;
        return this;
    }

    @NotNull
    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }
}