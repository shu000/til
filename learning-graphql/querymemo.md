## 5.2.1
```
query total {
  totalPhotos
}

mutation newPhoto($name: String!, $description: String) {
  postPhoto(name: $name, description: $description)
}
```

## 5.2.2
```
query total {
  totalPhotos
}

query listPhotos {
  allPhotos {
    id
    name
    description
    url
  }
}

mutation newPhoto($name: String!, $description: String) {
  postPhoto(name: $name, description: $description) {
    id
    name
    description
  }
}
```