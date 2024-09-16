package tech.jhipster.lite.module.domain.npm;

public enum JHLiteNpmVersionSource implements NpmVersionSourceFactory {
  COMMON("common"),
  ANGULAR("angular"),
  REACT("react"),
  SVELTE("svelte"),
  VUE("vue");

  private final String source;

  JHLiteNpmVersionSource(String source) {
    this.source = source;
  }

  @Override
  public NpmVersionSource build() {
    return new NpmVersionSource(source);
  }
}
