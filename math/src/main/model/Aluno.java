package model.Aluno

        public class Aluno {

public string matricula;
public String media;

                public string getMatricula() {
                        return matricula;
                }

                public void setMatricula(string matricula) {
                        this.matricula = matricula;
                }

                public String getMedia() {
                        return media;
                }

                public void setMedia(String media) {
                        this.media = media;
                }

                public boolean equals(Object object) {
                        if (this == object) return true;
                        if (object == null || getClass() != object.getClass()) return false;
                        if (!super.equals(object)) return false;
                        Aluno aluno = (Aluno) object;
                        return java.util.Objects.equals(matricula, aluno.matricula) && java.util.Objects.equals(media, aluno.media);
                }

                }
        }


