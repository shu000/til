## 5.2.1
```
query total {
  totalPhotos
}

mutation newPhoto($name: String!, $description: String) {
  postPhoto(name: $name, description: $description)
}
```